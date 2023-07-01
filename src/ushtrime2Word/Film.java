package ushtrime2Word;

public class Film {
    private String titulli;
    private String Studio;
    private String review;
    private String producenti;
    private int vitiProdhimit;
    public Film(String titulli, String producenti, String review){
        this.titulli=titulli;
        this.producenti=producenti;
        this.review=review;
    }
    public Film(String titulli, String studio, int vitiProdhimit){
        this.titulli=titulli;
        this.Studio=studio;
        this.vitiProdhimit=vitiProdhimit;
    }
    public void setTitulli(String titulli){
        this.titulli=titulli;
    }
    public void setStudio(String Studio){

        this.Studio=Studio;
    }
    public void setReview(String review){

        this.review=review;
    }
    public void setProducenti(String producenti){

        this.producenti=producenti;
    }
    public void setVitiProdhimit(int vitiProdhimit){

        this.vitiProdhimit=vitiProdhimit;
    }
    public String getTitulli(){

        return titulli;
    }
    public String getStudio(){

        return Studio;
    }
    public String getReview(){

        return review;
    }
    public String getProducenti(){

        return producenti;
    }
    public int getVitiProdhimit(){

        return vitiProdhimit;
    }
    //String titulli, String Studoi, String review, String producenti, int vitiProdhimit
    public void MovieDescription(){
        System.out.println("Titulli i filmit eshte "+titulli+
                " ky film u realizua nga studio "+ Studio+
                " ky film ka "+review+
                " yje vleresim, producenti i ketij filmi eshte "+producenti +
                " filmi eshte i vitit "+ vitiProdhimit);
    }
    public int vjetersia(int vitiProdhimit){
        return 2023-vitiProdhimit;
    }

}
