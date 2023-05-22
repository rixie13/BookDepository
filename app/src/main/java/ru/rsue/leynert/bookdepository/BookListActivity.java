package ru.rsue.leynert.bookdepository;

import androidx.fragment.app.Fragment;


import ru.rsue.leynert.bookdepository.BookDepository.SingleFragmentActivity;


public class BookListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new BookListFragment();
    }
}
