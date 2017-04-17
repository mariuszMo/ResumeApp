package pl.mariuszmondal.resume.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pl.mariuszmondal.resume.R;


public class SkillsFragment extends Fragment {


    public SkillsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_skills, container, false);
    }

    public static SkillsFragment newInstance() {
        
        Bundle args = new Bundle();
        
        SkillsFragment fragment = new SkillsFragment();
        fragment.setArguments(args);
        return fragment;
    }

}
