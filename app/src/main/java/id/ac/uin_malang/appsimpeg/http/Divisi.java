
package id.ac.uin_malang.appsimpeg.http;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Divisi implements Serializable
{

    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("kode")
    @Expose
    public String kode;
    @SerializedName("nama")
    @Expose
    public String nama;
    private final static long serialVersionUID = 8648473454666531202L;

    @Override
    public String toString() {
        return nama;
    }
}
