package id.iamnubs.studycase2.ui.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by iamnubs on 18/02/2018.
 */

public class MenuModel implements Parcelable {

    public MenuModel(int photo, String name, double harga, String komposisi) {
        this.photo = photo;
        this.name = name;
        this.harga = harga;
        this.komposisi = komposisi;
    }

    private int photo;
    private String name;
    private String komposisi;

    protected MenuModel(Parcel in) {
        photo = in.readInt();
        name = in.readString();
        komposisi = in.readString();
        harga = in.readDouble();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<MenuModel> CREATOR = new Creator<MenuModel>() {
        @Override
        public MenuModel createFromParcel(Parcel in) {
            return new MenuModel(in);
        }

        @Override
        public MenuModel[] newArray(int size) {
            return new MenuModel[size];
        }
    };

    public void setKomposisi(String komposisi) {
        this.komposisi = komposisi;
    }

    private double harga;

    public int getPhoto() {
        return photo;
    }

    public String getName() {
        return name;
    }

    public String getKomposisi() {
        return komposisi;
    }

    public double getHarga() {
        return harga;
    }


    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(photo);
        parcel.writeString(name);
        parcel.writeString(komposisi);
        parcel.writeDouble(harga);
    }
}
