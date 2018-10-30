package com.example.md.recyclerviewwithdatabinding;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.md.recyclerviewwithdatabinding.databinding.RowBinding;

import java.util.ArrayList;
import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonHolder> {
    private List<Person> personList = new ArrayList<>();

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PersonHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        RowBinding rowBinding = DataBindingUtil.inflate(inflater, R.layout.row, viewGroup, false);
        return new PersonHolder(rowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonHolder personHolder, int i) {
        personHolder.rowBinding.setPerson(personList.get(i));
    }


    @Override
    public int getItemCount() {
        return personList.size();
    }

    public class PersonHolder extends RecyclerView.ViewHolder {
        final RowBinding rowBinding;

        public PersonHolder(RowBinding rowBinding) {
            super(rowBinding.getRoot());
            this.rowBinding = rowBinding;
        }
    }
}
