package com.example.javainstagramclone.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javainstagramclone.databinding.RecyclerRowBinding;
import com.example.javainstagramclone.model.Post;
import com.example.javainstagramclone.view.FeedActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostHolder> {

    ArrayList<Post> postArrayList;

    public PostAdapter(ArrayList<Post> postArrayList) {
        this.postArrayList = postArrayList;
    }

    @NonNull
    @Override
    public PostHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new PostHolder(recyclerRowBinding);
    }


    @Override
    public void onBindViewHolder(@NonNull PostAdapter.PostHolder holder, int position) {
        holder.recyclerRowBinding.recyclerViewUserEmailText.setText(postArrayList.get(position).getEmail());
        holder.recyclerRowBinding.recyclerViewCommentText.setText(postArrayList.get(position).getComment());


        System.out.println(postArrayList.get(position).getDownloadUrl());

        Picasso.get().load(postArrayList.get(position).getDownloadUrl()).into(holder.recyclerRowBinding.recyclerViewImageView);
    }

    @Override
    public int getItemCount() {
        return postArrayList.size();
    }

    class PostHolder extends RecyclerView.ViewHolder{

        RecyclerRowBinding recyclerRowBinding;

        public PostHolder(@NonNull RecyclerRowBinding recyclerRowBinding) {
            super(recyclerRowBinding.getRoot());
            this.recyclerRowBinding = recyclerRowBinding;
        }
    }
}
