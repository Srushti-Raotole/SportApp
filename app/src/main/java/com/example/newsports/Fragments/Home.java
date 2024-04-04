package com.example.newsports.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.newsports.Adapter.ProfileAdapter;
import com.example.newsports.R;
import com.example.newsports.model.UserProfile_model;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class Home extends Fragment {
        //implements SearchView.OnQueryTextListener{


//    private RecyclerView recyclerView;
//    private ProfileAdapter adapter;
//    private List<UserProfile_model> userProfileList;
//    private List<UserProfile_model> filteredUserProfileList;
//    private FirebaseFirestore db;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =inflater.inflate(R.layout.fragment_home, container, false);
//
//
//        recyclerView = rootView.findViewById(R.id.recycler_view);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//
//
//        userProfileList = new ArrayList<>();
//        adapter = new ProfileAdapter(userProfileList);
//        recyclerView.setAdapter(adapter);
//
//        setHasOptionsMenu(true);
//
//        db = FirebaseFirestore.getInstance();
//
//        fetchUserProfiles();
        return rootView;
    }

//    @Override
//    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
//        inflater.inflate(R.menu.main, menu);
//        MenuItem searchItem = menu.findItem(R.id.search);
//        SearchView searchView = (SearchView) searchItem.getActionView();
//        searchView.setOnQueryTextListener(this);
//        super.onCreateOptionsMenu(menu, inflater);
//    }
//
//
//    @Override
//    public boolean onQueryTextSubmit(String query) {
//        return false;
//    }
//
//    @Override
//    public boolean onQueryTextChange(String newText) {
//        filteredUserProfileList = filter(userProfileList, newText);
//        adapter.setData(filteredUserProfileList);
//        return true;
//    }
//
//    private List<UserProfile_model> filter(List<UserProfile_model> userProfileList, String query) {
//        query = query.toLowerCase();
//        List<UserProfile_model> filteredList = new ArrayList<>();
//        for (UserProfile_model userProfileModel : userProfileList) {
//            if (userProfileModel.getUsername().toLowerCase().contains(query)) {
//                filteredList.add(userProfileModel);
//            }
//        }
//        return filteredList;
//    }
//
//
//    private void fetchUserProfiles() {
//        db.collection("profiles").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
//            @Override
//            public void onComplete(@NonNull Task<QuerySnapshot> task) {
//                if (task.isSuccessful()) {
//                    for (QueryDocumentSnapshot documentSnapshot : task.getResult()) {
//                        UserProfile_model userProfileModel = documentSnapshot.toObject(UserProfile_model.class);
//                        userProfileList.add(userProfileModel);
//                    }
//                    adapter.setData(userProfileList);
//                } else {
//                    Toast.makeText(getActivity(), "Error in getting profile", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
    }
