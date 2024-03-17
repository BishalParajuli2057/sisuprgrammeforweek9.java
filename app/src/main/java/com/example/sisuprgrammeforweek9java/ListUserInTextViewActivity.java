package com.example.sisuprgrammeforweek9java;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListUserInTextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<User> users = UserStorage.getInstance().getUsers();
        StringBuilder usersText = new StringBuilder();
        for (User user : users) {
            usersText.append("Nimi: ").append(user.getFirstName()).append(" ").append(user.getLastName())
                    .append(", Sähköposti: ").append(user.getEmail())
                    .append(", Tutkinto-ohjelma: ").append(user.getDegreeProgram()).append("\n\n");
        }
    }
}
