abstract class Metal {
    public abstract int getEndurance();
}
class steel extends Metal {
    public int getEndurance() {
        return 50;
    }
}
class iron extends Metal {
    public int getEndurance() {
        return 30;

    }
}
class copper extends Metal {
    public int getEndurance() {
        return 20;
    }
}
class Plastic {}
class Sword<M extends Metal> {
    private final M metal;
    public Sword(M metal) {
        this.metal = metal;
    }
    public boolean checkEndurance() {
        return metal.getEndurance() > 49;
    }
}



