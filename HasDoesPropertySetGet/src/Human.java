public class Human extends utilclass {

    private int body;
    private int leg;
    private int ear;

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getEar() {
        return ear;
    }

    public void setEar(int ear) {
        this.ear = ear;
    }

    public void wholeBodyFunction (){
        System.out.println(body+leg+ear);
    }

    private void legCanWalk(){
        System.out.println("walking");
    }

    int head;

    public void shadhin(){

    }

}
