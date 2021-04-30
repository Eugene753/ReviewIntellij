package reviewclass10;

public abstract class DataBase {

    public abstract void readFromDataBase(String databaseName);
    public abstract void writeFromDataBase(String databaseName);
    public abstract void modifyFromDataBase(String databaseName);
}
class OracleDatabase extends DataBase{

    @Override
    public void readFromDataBase(String databaseName) {
        System.out.println("we are the oracle experts we have provided the implementations reading data base from OracleDatabase");
    }

    @Override
    public void writeFromDataBase(String databaseName) {
        System.out.println("we are the oracle experts we have the implemetations writing data base from OracleDatabase");
    }

    @Override
    public void modifyFromDataBase(String databaseName) {
        System.out.println("we are the oracle experts we have the implemetations modify data base from OracleDatabase");
    }
}
class MicrosoftDatabase extends DataBase{

    @Override
    public void readFromDataBase(String databaseName) {
        System.out.println("we are the oracle experts we have provided the implementations reading data base from MicrosoftDatabase");
    }

    @Override
    public void writeFromDataBase(String databaseName) {
        System.out.println("we are the oracle experts we have the implemetations writing data base from MicrosoftDatabase");
    }

    @Override
    public void modifyFromDataBase(String databaseName) {
        System.out.println("we are the oracle experts we have the implemetations modify data base from MicrosoftDatabase");
    }
}

abstract class IBMDatabase extends DataBase{
    @Override
    public void readFromDataBase(String databaseName){
        System.out.println("we are the IBM experts we have provided the implementations reading data base from IBMDatabase");
    }
}
