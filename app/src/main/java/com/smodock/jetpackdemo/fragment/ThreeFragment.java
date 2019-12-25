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
import com.smodock.jetpackdemo.databinding.FragmentThreeBinding;

/**
*
* @author malian
* @time 2019/12/16 11:05
*/
public class ThreeFragment extends Fragment {

    private FragmentThreeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_three, container, false);
        binding.threeTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_threeFragment_to_oneFragment);
            }
        });
        // Inflate the layout for this fragment
        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("three", "onCreate");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("three", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("three", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("three", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("three", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("three", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("three", "onDestroy");
    }
}
