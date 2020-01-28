package cindodcindy.sirihpinang.cindoddagger;

import javax.inject.Inject;

public class Jeruk {

    String jeruk;
    @Inject
    public Jeruk(){

    }

    public void setJeruk(String jeruk){
        this.jeruk=jeruk;
    }

    public String getJeruk(){
        return jeruk;
    }

}
