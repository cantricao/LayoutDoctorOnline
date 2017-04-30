package com.example.cantri.layoutdoctoronline;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by cantri on 27/04/2017.
 */

public class ClinicAdapter extends RecyclerView.Adapter<ClinicAdapter.MyViewHolder> {

    private List<Clinic> clinicList;

    public ClinicAdapter(List<Clinic> clinicList) {
        this.clinicList = clinicList;
    }

    @Override
    public ClinicAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.clinic_list_row, parent, false);

        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(ClinicAdapter.MyViewHolder holder, int position) {
        Clinic clinic = clinicList.get(position);
        holder.clinic_name.setText(clinic.getName());
        holder.clinic_specialty.setText(clinic.getSpecialty());
        holder.clinic_key.setText(clinic.getKey());
    }

    @Override
    public int getItemCount() {
        return clinicList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView clinic_name,clinic_specialty, clinic_key;
        public MyViewHolder(final View itemView) {
            super(itemView);
            clinic_name = (TextView) itemView.findViewById(R.id.clinic_name);
            clinic_key = (TextView) itemView.findViewById(R.id.clinic_key);
            clinic_specialty = (TextView) itemView.findViewById(R.id.clinic_specialty);
        }
    }
}
