package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javax.sound.midi.Soundbank;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {



        /*
    String [][] rdpLink = new String[][] {
            {"i7303-app001","10.173.103.16"},
            {"i7303-app002","10.173.103.13"},
            {"i7303-app003","10.173.103.12"},
            {"i7303-app005","10.173.103.29"},
            {"i7303-app006","10.173.103.5"},
            {"i7303-app007","10.173.103.17"},
            {"i7303-app010","10.173.103.6"},
            {"i7303-app011","10.173.103.132"},
            {"i7303-app012","10.173.103.28"},
            {"i7303-app013","10.173.103.19"},
            {"i7303-app014","10.173.103.21"},
            {"i7303-app015","10.173.103.15"},
            {"i7303-app016","10.173.103.26"},
            {"i7303-app017","10.173.103.7"},
            {"i7303-app018","10.173.103.18"},
            {"i7303-app019","10.173.103.14"},
            {"i7303-app020","10.173.103.22"},
            {"i7303-app021","10.173.103.23"},
            {"i7303-sys333","10.173.103.2"},
            };
        */

    public Button app003;
    public Button app002;
    public Button app005;
    public Button app006;
    public Button app007;
    public Button app001;
    public Button app010;
    public Button app011;
    public Button app012;
    public Button app013;
    public Button app014;
    public Button app015;
    public Button app016;
    public Button app017;
    public Button app018;
    public Button app019;
    public Button app020;
    public Button app021;
    public Button sys333;
    public Button kasper;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        app003.setText(ReadFile.m[2][0]);
        app002.setText(ReadFile.m[1][0]);
        app005.setText(ReadFile.m[3][0]);
        app006.setText(ReadFile.m[4][0]);
        app007.setText(ReadFile.m[5][0]);
        app001.setText(ReadFile.m[0][0]);
        app010.setText(ReadFile.m[6][0]);
        app011.setText(ReadFile.m[7][0]);
        app012.setText(ReadFile.m[8][0]);
        app013.setText(ReadFile.m[9][0]);
        app014.setText(ReadFile.m[10][0]);
        app015.setText(ReadFile.m[11][0]);
        app016.setText(ReadFile.m[12][0]);
        app017.setText(ReadFile.m[13][0]);
        app018.setText(ReadFile.m[14][0]);
        app019.setText(ReadFile.m[15][0]);
        app020.setText(ReadFile.m[16][0]);
        app021.setText(ReadFile.m[17][0]);
        sys333.setText(ReadFile.m[18][0]);
        kasper.setText(ReadFile.m[19][0]);


    }

    public void app001Action1(ActionEvent actionEvent) {

        Runtime rt = Runtime.getRuntime();
        try {   // try == попытаться если не получилось пропустить и продолжить

            rt.exec(new String[]{"cmd.exe","/c", "mstsc /admin /v:" + ReadFile.m[0][1]});
            //rt.exec(new String[]{"cmd.exe","/c", "mstsc /admin /v:" + rdpLink[0][0]});
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace(); // тут можно ничего не писать ели не собираемся ловить ошибки
        }

    }

    public void app002Action1(ActionEvent actionEvent) {
        Runtime rt = Runtime.getRuntime();
        try {   // try == попытаться если не получилось пропустить и продолжить
            rt.exec(new String[]{"cmd.exe","/c", "mstsc /admin /v:" + ReadFile.m[1][1]});
            //rt.exec(new String[]{"cmd.exe","/c", rdpLink[1][1]});
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace(); // тут можно ничего не писать ели не собираемся ловить ошибки
        }
    }


    public void app003Action1(ActionEvent actionEvent) {
            Runtime rt = Runtime.getRuntime();
        try {   // try == попытаться если не получилось пропустить и продолжить
            rt.exec(new String[]{"cmd.exe","/c", "mstsc /admin /v:" + ReadFile.m[2][1]});
            //rt.exec(new String[]{"cmd.exe","/c", rdpLink[1][1]});
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace(); // тут можно ничего не писать ели не собираемся ловить ошибки
        }
    }


    public void app005Action1(ActionEvent actionEvent) {
        Runtime rt = Runtime.getRuntime();
        try {   // try == попытаться если не получилось пропустить и продолжить
            rt.exec(new String[]{"cmd.exe","/c", "mstsc /admin /v:" + ReadFile.m[3][1]});
            //rt.exec(new String[]{"cmd.exe","/c", rdpLink[1][1]});
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace(); // тут можно ничего не писать ели не собираемся ловить ошибки
        }
    }

    public void app006Action1(ActionEvent actionEvent) {
        Runtime rt = Runtime.getRuntime();
        try {   // try == попытаться если не получилось пропустить и продолжить
            rt.exec(new String[]{"cmd.exe","/c", "mstsc /admin /v:" + ReadFile.m[4][1]});
            //rt.exec(new String[]{"cmd.exe","/c", rdpLink[1][1]});
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace(); // тут можно ничего не писать ели не собираемся ловить ошибки
        }
    }

    public void app007Action1(ActionEvent actionEvent) {
        Runtime rt = Runtime.getRuntime();
        try {   // try == попытаться если не получилось пропустить и продолжить
            rt.exec(new String[]{"cmd.exe","/c", "mstsc /admin /v:" + ReadFile.m[5][1]});
            //rt.exec(new String[]{"cmd.exe","/c", rdpLink[1][1]});
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace(); // тут можно ничего не писать ели не собираемся ловить ошибки
        }
    }

    public void app010Action1(ActionEvent actionEvent) {
        Runtime rt = Runtime.getRuntime();
        try {   // try == попытаться если не получилось пропустить и продолжить
            rt.exec(new String[]{"cmd.exe","/c", "mstsc /admin /v:" + ReadFile.m[6][1]});
            //rt.exec(new String[]{"cmd.exe","/c", rdpLink[1][1]});
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace(); // тут можно ничего не писать ели не собираемся ловить ошибки
        }
    }

    public void app011Action1(ActionEvent actionEvent) {
        Runtime rt = Runtime.getRuntime();
        try {   // try == попытаться если не получилось пропустить и продолжить
            rt.exec(new String[]{"cmd.exe","/c", "mstsc /admin /v:" + ReadFile.m[7][1]});
            //rt.exec(new String[]{"cmd.exe","/c", rdpLink[1][1]});
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace(); // тут можно ничего не писать ели не собираемся ловить ошибки
        }
    }

    public void app012Action1(ActionEvent actionEvent) {
        Runtime rt = Runtime.getRuntime();
        try {   // try == попытаться если не получилось пропустить и продолжить
            rt.exec(new String[]{"cmd.exe","/c", "mstsc /admin /v:" + ReadFile.m[8][1]});
            //rt.exec(new String[]{"cmd.exe","/c", rdpLink[1][1]});
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace(); // тут можно ничего не писать ели не собираемся ловить ошибки
        }
    }

    public void app013Action1(ActionEvent actionEvent) {
        Runtime rt = Runtime.getRuntime();
        try {   // try == попытаться если не получилось пропустить и продолжить
            rt.exec(new String[]{"cmd.exe","/c", "mstsc /admin /v:" + ReadFile.m[9][1]});
            //rt.exec(new String[]{"cmd.exe","/c", rdpLink[1][1]});
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace(); // тут можно ничего не писать ели не собираемся ловить ошибки
        }
    }

    public void app014Action1(ActionEvent actionEvent) {
        Runtime rt = Runtime.getRuntime();
        try {   // try == попытаться если не получилось пропустить и продолжить
            rt.exec(new String[]{"cmd.exe","/c", "mstsc /admin /v:" + ReadFile.m[10][1]});
            //rt.exec(new String[]{"cmd.exe","/c", rdpLink[1][1]});
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace(); // тут можно ничего не писать ели не собираемся ловить ошибки
        }
    }

    public void app015Action1(ActionEvent actionEvent) {
        Runtime rt = Runtime.getRuntime();
        try {   // try == попытаться если не получилось пропустить и продолжить
            rt.exec(new String[]{"cmd.exe","/c", "mstsc /admin /v:" + ReadFile.m[11][1]});
            //rt.exec(new String[]{"cmd.exe","/c", rdpLink[1][1]});
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace(); // тут можно ничего не писать ели не собираемся ловить ошибки
        }
    }

    public void app016Action1(ActionEvent actionEvent) {
        Runtime rt = Runtime.getRuntime();
        try {   // try == попытаться если не получилось пропустить и продолжить
            rt.exec(new String[]{"cmd.exe","/c", "mstsc /admin /v:" + ReadFile.m[12][1]});
            //rt.exec(new String[]{"cmd.exe","/c", rdpLink[1][1]});
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace(); // тут можно ничего не писать ели не собираемся ловить ошибки
        }
    }

    public void app017Action1(ActionEvent actionEvent) {
        Runtime rt = Runtime.getRuntime();
        try {   // try == попытаться если не получилось пропустить и продолжить
            rt.exec(new String[]{"cmd.exe","/c", "mstsc /admin /v:" + ReadFile.m[13][1]});
            //rt.exec(new String[]{"cmd.exe","/c", rdpLink[1][1]});
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace(); // тут можно ничего не писать ели не собираемся ловить ошибки
        }
    }

    public void app018Action1(ActionEvent actionEvent) {Runtime rt = Runtime.getRuntime();
        try {   // try == попытаться если не получилось пропустить и продолжить
            rt.exec(new String[]{"cmd.exe","/c", "mstsc /admin /v:" + ReadFile.m[14][1]});
            //rt.exec(new String[]{"cmd.exe","/c", rdpLink[1][1]});
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace(); // тут можно ничего не писать ели не собираемся ловить ошибки
        }
    }

    public void app019Action1(ActionEvent actionEvent) {
        Runtime rt = Runtime.getRuntime();
        try {   // try == попытаться если не получилось пропустить и продолжить
            rt.exec(new String[]{"cmd.exe","/c", "mstsc /admin /v:" + ReadFile.m[15][1]});
            //rt.exec(new String[]{"cmd.exe","/c", rdpLink[1][1]});
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace(); // тут можно ничего не писать ели не собираемся ловить ошибки
        }
    }

    public void app020Action1(ActionEvent actionEvent) {
        Runtime rt = Runtime.getRuntime();
        try {   // try == попытаться если не получилось пропустить и продолжить
            rt.exec(new String[]{"cmd.exe","/c", "mstsc /admin /v:" + ReadFile.m[16][1]});
            //rt.exec(new String[]{"cmd.exe","/c", rdpLink[1][1]});
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace(); // тут можно ничего не писать ели не собираемся ловить ошибки
        }
    }

    public void app021Action1(ActionEvent actionEvent) {
        Runtime rt = Runtime.getRuntime();
        try {   // try == попытаться если не получилось пропустить и продолжить
            rt.exec(new String[]{"cmd.exe","/c", "mstsc /admin /v:" + ReadFile.m[17][1]});
            //rt.exec(new String[]{"cmd.exe","/c", rdpLink[1][1]});
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace(); // тут можно ничего не писать ели не собираемся ловить ошибки
        }
    }

    public void sys333Action1(ActionEvent actionEvent) {
        Runtime rt = Runtime.getRuntime();
        try {   // try == попытаться если не получилось пропустить и продолжить
            rt.exec(new String[]{"cmd.exe","/c", "mstsc /admin /v:" + ReadFile.m[18][1]});
            //rt.exec(new String[]{"cmd.exe","/c", rdpLink[1][1]});
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace(); // тут можно ничего не писать ели не собираемся ловить ошибки
        }
    }

    public void KasperAction1(ActionEvent actionEvent) {
        Runtime rt = Runtime.getRuntime();
        try {   // try == попытаться если не получилось пропустить и продолжить
            rt.exec(new String[]{"cmd.exe","/c", ReadFile.m[19][1]});
            //rt.exec(new String[]{"cmd.exe","/c", rdpLink[1][1]});
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace(); // тут можно ничего не писать ели не собираемся ловить ошибки
        }
    }
}
