package Store;

import java.util.Arrays;


public class StoreManagement {
    private int n;
    private Store[] stores;

    public StoreManagement(){

    }

    public StoreManagement(int n) {
        this.n = n;
        this.stores = new Store[n];
        for (int i = 0; i <n ; i++) {
            stores[i]=new Store(i+1);
        }
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Store[] getStores() {
        return stores;
    }

    public void setStores(Store[] stores) {
        this.stores = stores;

    }

    @Override
    public String toString() {
        return "StoreManagement{" +
                "n=" + n +
                ", stores=" + Arrays.toString(stores) +
                '}';
    }

    public void prinf(){
        for (int i = 0; i <n ; i++) {
            stores[i].prinf(i+1);
        }
    }

}
