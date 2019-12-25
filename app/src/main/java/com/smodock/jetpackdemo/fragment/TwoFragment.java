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
import com.smodock.jetpackdemo.databinding.FragmentTwoBinding;

/**
*
* @author malian
* @time 2019/12/16 11:04
*/
public class TwoFragment extends Fragment {

    private FragmentTwoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_two, container, false);
        Bundle bundle = getArguments();
        if (bundle != null) {
            String str = OneFragmentArgs.fromBundle(bundle).getMessage();
//            String str = bundle.getString("message", "没有传值");
            binding.twoMessageTv.setText(str);
        }


        binding.twoTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_twoFragment_to_threeFragment);
            }
        });
        // Inflate the layout for this fragment
        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("two", "onCreate");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("two", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("two", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("two", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("two", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("two", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("two", "onDestroy");
    }

}
