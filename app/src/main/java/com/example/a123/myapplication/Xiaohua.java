package com.example.a123.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.yalantis.phoenix.PullToRefreshView;

import org.json.JSONObject;
import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;

/**
 * Created by 123 on 2016/8/17.
 */
public class Xiaohua extends Fragment {
    ArrayList<String> xiaohua=new ArrayList<>();
    ArrayList<String> time=new ArrayList<>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.listviewfragment,null);
        final PullToRefreshView mPullToRefreshView = (PullToRefreshView)view. findViewById(R.id.pull_to_refresh);
        final ListView listView= (ListView)view.findViewById(R.id.list_view);

        wangluo();
        final BaseAdapter baseAdapter=new BaseAdapter() {
            @Override
            public int getCount() {
                return xiaohua.size();
            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                view=LayoutInflater.from(getContext()).inflate(R.layout.xiaohuaitem,null);
                ((TextView)view.findViewById(R.id.xiaohua_xiaohua)).setText(xiaohua.get(i));
                ((TextView)view.findViewById(R.id.xiaohua_shijian)).setText(time.get(i));



                return view;
            }
        };
        listView.setAdapter(baseAdapter);
        mPullToRefreshView.setOnRefreshListener(new PullToRefreshView.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mPullToRefreshView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mPullToRefreshView.setRefreshing(false);


                        wangluo();






                    }
                },20);
            }
        });

        return view;
    }
    int s=1;
    public void wangluo(){

        RequestParams rp=new RequestParams("http://japi.juhe.cn/joke/content/list.from?key=f5253765c4600b617d004c927dc10f04&page="+s+"&pagesize=10&sort=asc&time=1418745237");
        x.http().get(rp, new Callback.CommonCallback<String>() {



            public void onSuccess(String result) {
                Xiaohuautil xiaohuautil = JSON.parseObject(result,Xiaohuautil.class);
                for(int i=0;i<xiaohuautil.getResult().getData().size();i++){
                    time.add(xiaohuautil.getResult().getData().get(i).getUpdatetime());
                    xiaohua.add(xiaohuautil.getResult().getData().get(i).getContent());

                }

                Log.d("TAG", "lailailai");
                s=s+1;
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Log.d("TAG","zouzouzou");



            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });

    }
}

