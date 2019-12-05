package com.oreo.busreservation;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class MainMemberFragment extends Fragment {
    Button buttonSearchBus;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_member, container, false);

        buttonSearchBus = view.findViewById(R.id.btn_search_bus);
        buttonSearchBus.setOnClickListener((v) -> {
            Intent intent = new Intent(getActivity(), SearchBusActivity.class);
            startActivity(intent);
        });
        return view;
    }
}
