package thiago.neves.appgaleriapublica;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainViewModel extends AndroidViewModel {
    // grid como layout padrão
    int navigationOpSelected = R.id.gridViewOp;

    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    // pega o tipo de vizualização selecionada na bottomNav
    public int getNavigationOpSelected() {
        return navigationOpSelected;
    }

    // define o tipo de visualização da tela
    public void setNavigationOpSelected(int navigationOpSelected) {
        this.navigationOpSelected = navigationOpSelected;
    }

}
