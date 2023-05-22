package ru.rsue.leynert.bookdepository;

import android.content.Context;
import android.content.Intent;


import androidx.fragment.app.Fragment;

import java.util.UUID;


import ru.rsue.leynert.bookdepository.BookDepository.SingleFragmentActivity;


public class BookActivity extends SingleFragmentActivity {
    private static final String EXTRA_BOOK_ID = "ru.rsue.bugakovnikita.bookdepository.book_id";

    public static Intent newIntent(Context packageContext, UUID bookId) {
        Intent intent = new Intent(packageContext, BookActivity.class);
        intent.putExtra(EXTRA_BOOK_ID, bookId);
        return intent;
    }

    @Override
    protected Fragment createFragment() {
        UUID bookId = (UUID) getIntent()
                .getSerializableExtra(EXTRA_BOOK_ID);
        return BookFragment.newInstance(bookId);
    }
}