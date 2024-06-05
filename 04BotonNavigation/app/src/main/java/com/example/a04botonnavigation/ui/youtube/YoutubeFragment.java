package com.example.a04botonnavigation.ui.youtube;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.a04botonnavigation.databinding.FragmentNotificationsBinding;


public class YoutubeFragment extends Fragment {

    private FragmentNotificationsBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        YoutubeViewModel notificationsViewModel =
                new ViewModelProvider(this).get(YoutubeViewModel.class);


        binding = FragmentNotificationsBinding.inflate(inflater, container, false);

        View root = binding.getRoot();

        final TextView textView = binding.textNotifications;
        notificationsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
