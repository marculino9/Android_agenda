package br.edu.unifcv.agenda;

import androidx.appcompat.app.AppCompatActivity;

public class ContatoAdicionar extends AppCompatActivitym{
    private


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contato_adicionar);

        this.sobrenome_edit = this.findViewById(R.id.sobrenome_edit);
        this.email_edit = this.findViewById(R.id.email_edit);
        this.referencia_edit = this.findViewById(R.id.referencia_edit);
        this.endereço_edit = this.findViewById(R.id.endereço_edit);
}
