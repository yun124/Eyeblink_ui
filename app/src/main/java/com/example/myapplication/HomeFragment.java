package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.myapplication.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        binding.needsButton.setOnClickListener(view1 -> {
            // Handle the button click, like replacing the fragment
            ((MainActivity) getActivity()).replaceFragment(new NeedsFragment());
        });


//        binding.greetingsButton.setOnClickListener(view1 -> {
//            ((MainActivity) getActivity()).replaceFragment(new GreetingsFragment());
//        });

        // Similarly for emotions_button, health_button, and commands_button...

        return view;
    }
}