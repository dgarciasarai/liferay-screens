package com.liferay.mobile.screens.testapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.liferay.mobile.screens.listbookmark.Bookmark;
import com.liferay.mobile.screens.listbookmark.BookmarkListListener;
import com.liferay.mobile.screens.listbookmark.BookmarkListScreenlet;
import java.util.List;

public class ListBookmarksActivity extends AppCompatActivity implements BookmarkListListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_bookmarks);

		BookmarkListScreenlet bookmarkListScreenlet = (BookmarkListScreenlet) findViewById(R.id.bookmarklist_screenlet);
		bookmarkListScreenlet.setListener(this);
	}

	@Override
	public void onListPageFailed(int startRow, Exception e) {

	}

	@Override
	public void onListPageReceived(int startRow, int endRow, List<Bookmark> entries, int rowCount) {

	}

	@Override
	public void onListItemSelected(Bookmark element, View view) {

	}

	@Override
	public void error(Exception e, String userAction) {

	}

	@Override
	public void interactorCalled() {

	}
}
