package cindodcindy.sirihpinang.cindoddagger;

import javax.inject.Inject;

public class Apel {

    String apel;

    @Inject
    public  Apel(){

    }

    public void setApel (String apel){
        this.apel=apel;
    }

    public  String getApel(){
        return apel;
    }


}
