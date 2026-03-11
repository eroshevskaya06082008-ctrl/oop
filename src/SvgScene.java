public class SvgScene {
    private Polygon[] polygon= new Polygon[3];
    private int index = 0;
    public void addPolygon(Polygon p) {
        polygon[index] = p;
        index++;
        if(index == polygon.length) {
            index =0;
        }
    }
    public String toSvg() {
        String res = "";
        for(Polygon p : polygon) {
            if(p!= null) {
                res += p.toSvg();
            }
        }
        return res;
    }
}
