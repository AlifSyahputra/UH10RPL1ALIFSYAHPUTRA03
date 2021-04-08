package com.example.uh10rpl1alifsyahputra03;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class logdataadapter extends RecyclerView.Adapter<logdataadapter.MahasiswaViewHolder> {
    private ArrayList<logdata> dataList;

    public logdataadapter(ArrayList<logdata> dataList) {
        this.dataList = dataList;
    }

    @Override
    public MahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.tampilan, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MahasiswaViewHolder holder, int position) {
        holder.txtnamapengajar.setText(dataList.get(position).getnamapengajar());
        holder.txtnamapelajaran.setText(dataList.get(position).getnamapelajaran());
        holder.txtjumlahorang.setText(dataList.get(position).getjumlahorang());
        holder.txttanggal.setText(dataList.get(position).gettanggal());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder {
        private TextView txtnamapengajar, txtnamapelajaran, txtjumlahorang, txttanggal;

        public MahasiswaViewHolder(View itemView) {
            super(itemView);
            txtnamapengajar = (TextView) itemView.findViewById(R.id.txt_namapengajar_logdata);
            txtnamapelajaran = (TextView) itemView.findViewById(R.id.txt_namapelajaran_logdata);
            txtjumlahorang = (TextView) itemView.findViewById(R.id.txt_jumlahorang_logdata);
            txttanggal = (TextView) itemView.findViewById(R.id.txttanggal);
        }
    }
}
