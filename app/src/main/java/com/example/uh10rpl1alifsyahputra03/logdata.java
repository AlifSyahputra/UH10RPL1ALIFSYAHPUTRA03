package com.example.uh10rpl1alifsyahputra03;

public class logdata {
    private String namapengajar, namapelajaran, jumlahorang, tanggal;


    public logdata(String namapengajar, String namapelajaran, String jumlahorang, String tanggal) {
        this.namapengajar = namapengajar;
        this.namapelajaran = namapelajaran;
        this.jumlahorang = jumlahorang;
        this.tanggal = tanggal;

    }

    public String getnamapengajar() {
        return namapengajar;
    }

    public void setnamapengajar(String nama) { this.namapengajar = nama; }

    public String getnamapelajaran() {
        return namapelajaran;
    }

    public void setpenamalajaran(String namapelajaran) { this.namapelajaran = namapelajaran; }

    public String getjumlahorang() { return jumlahorang; }

    public void setJumlahorang(String jumlahorang) {
        this.jumlahorang = jumlahorang;
    }

    public String gettanggal() {return tanggal;}

    public void settanggal(String tanggal) { this.tanggal = tanggal; }
}

