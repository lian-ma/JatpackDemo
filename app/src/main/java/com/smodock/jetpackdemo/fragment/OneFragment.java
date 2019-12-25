package com.smodock.jetpackdemo.fragment;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smodock.jetpackdemo.R;
import com.smodock.jetpackdemo.databinding.FragmentOneBinding;

/**
*
* @author malian
* @time 2019/12/16 11:03
*/
public class OneFragment extends Fragment {

    private FragmentOneBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_one, container, false);
        //第一种跳转方式
        binding.oneTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                //第一种传值方式
//                bundle.putString("message", "我是传过来的值");

                //第二种传值方式
                OneFragmentArgs.Builder builder = new OneFragmentArgs.Builder();
                bundle = builder.setMessage("我是另一种方法转过来的值").build().toBundle();

                Navigation.findNavController(view).navigate(R.id.action_oneFragment_to_twoFragment2, bundle);
            }
        });
        //第二种跳转方式
//        binding.oneTv.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_oneFragment_to_twoFragment2));
        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("one", "onCreate");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("one", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("one", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("one", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("one", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("one", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("one", "onDestroy");
    }
}
