package pl.mariuszmondal.resume.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pl.mariuszmondal.resume.FragmentContactRecyclerView;
import pl.mariuszmondal.resume.Model.Contact.CVModel;
import pl.mariuszmondal.resume.Model.Contact.CVModelRepository;
import pl.mariuszmondal.resume.R;



public class ContactFragment extends Fragment {



    public ContactFragment() {
        // Required empty public constructor
    }

    public static ContactFragment newInstance() {
        ContactFragment fragment = new ContactFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ButterKnife.bind(getActivity());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        // Inflate the layout for this fragment
        RecyclerView recyclerView= (RecyclerView) view.findViewById(R.id.contact_fragment_recycler_view);
        recyclerView.setAdapter(new FragmentContactRecyclerView(CVModelRepository.defaultValuesArraylist(),getContext()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }





}
