package jp.ac.tsukuba.cs.coins_p.aid.handyword;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import jp.ac.tsukuba.cs.coins_p.aid.handyword.database.model.WordCardModel;
import jp.ac.tsukuba.cs.coins_p.aid.handyword.wordcard.WordCardQuestionActivity;
import jp.ac.tsukuba.cs.coins_p.aid.handyword.wordcard.WordCardRegisterActivity;
import jp.ac.tsukuba.cs.coins_p.aid.handyword.wordcard.WordCardsListActivity;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        WordCardModel.getInstance().initRealmInstance(getApplicationContext());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        // TODO preference activity
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @OnClick({
            R.id.menu_all_words_button,
            R.id.menu_add_words_button,
            R.id.menu_question_words_button
    })
    public void moveToFuncActivity(Button menuButton) {
        String menuType;
        Intent intent;
        switch (menuButton.getId()) {
            case R.id.menu_all_words_button:
                menuType = "all";
                break;
            case R.id.menu_add_words_button:
                intent = new Intent(this, WordCardRegisterActivity.class);
                startActivity(intent);
                return;
            case R.id.menu_question_words_button:
                intent = new Intent(this, WordCardQuestionActivity.class);
                startActivity(intent);
                return;
            default:
                menuType = null;
                break;
        }
        intent = WordCardsListActivity.createNewIntent(this, menuType);
        startActivity(intent);
    }
}
