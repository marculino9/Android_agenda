package br.edu.unifcv.agenda;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class BancoController{
    private SQLiteDatabase db;
    private Contato_Banco banco;

    public BancoController(Context context){
        banco = new Contato_Banco(context);
    }

    public String insereDados(String nome, String sobrenome, String numero, String endereco, String email, String referencia){
        ContentValues valores;
        long resultado;

        db = banco.getWritableDatabase();
        valores = new ContentValues();
        valores.put(Contato_Banco.NUMERO,numero);
        valores.put(Contato_Banco.NOME, nome);
        valores.put(Contato_Banco.SOBRENOME, sobrenome);
        valores.put(Contato_Banco.ENDERECO,endereco);
        valores.put(Contato_Banco.EMAIL,email);
        valores.put(Contato_Banco.REFERENCIA, referencia);

        resultado = db.insert(Contato_Banco.TABELA, null, valores);
        db.close();

        if (resultado == -1) {
            return "Erro ao inserir registro";
        } else {
            return "SUCESSO";
        }
    }
}

