package cindodcindy.sirihpinang.cindoddagger;

import javax.inject.Inject;

public class Anggur {
    String anggur;

    @Inject
    public  Anggur(){

    }

    public void setAnggur(String anggur){
        this.anggur=anggur;

    }

    public String getAnggur(){
        return anggur;
    }


}
