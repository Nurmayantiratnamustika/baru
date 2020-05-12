package com.nurma.absensi.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nurma.absensi.GuruActivity;
import com.nurma.absensi.R;
import com.nurma.absensi.model.Login;

import java.util.List;

public class LoginAdapter extends RecyclerView.Adapter<LoginAdapter.ViewHolder> {
    List<Login> loginList;
    Context mContext;

    public LoginAdapter(List<Login> loginList, Context mContext) {
        this.loginList = loginList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public LoginAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_login, parent, false);
        return new ViewHolder(itemView);
    }

    public void setLoginList(List<Login> loginList){
        this.loginList=loginList;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull LoginAdapter.ViewHolder holder, int position) {
        final Login itemLogin = loginList.get(position);
        holder.tvUsername.setText(itemLogin.getUsername());
        holder.tvPassword.setText(itemLogin.getPassword());
        holder.tvJamlogin.setText(itemLogin.getJam_login());
        holder.tvTanggal.setText(itemLogin.getTanggal());
        holder.tvJamlogout.setText(itemLogin.getJam_logout());

    }

    @Override
    public int getItemCount() {
        return loginList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvUsername;
        TextView tvPassword;
        TextView tvJamlogin;
        TextView tvTanggal;
        TextView tvJamlogout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvUsername = itemView.findViewById(R.id.usernameLogin);
            tvPassword= itemView.findViewById(R.id.passwordLogin);
            tvJamlogin=itemView.findViewById(R.id.jamLogin);
            tvTanggal=itemView.findViewById(R.id.tanggalLogin);
            tvJamlogout=itemView.findViewById(R.id.jamLogout);
        }
    }
}
