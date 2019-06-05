package com.e.mymostpopulerapi.ui.main;

import android.arch.core.util.Function;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Transformations;
import android.arch.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {

    private String mostEmailed;
    private String mostShared;
    private String mostViewed;

    public PageViewModel() {
    }

    public void setMostEmailed(String mostEmailed) {
        this.mostEmailed = mostEmailed;
    }

    public void setMostShared(String mostShared) {
        this.mostShared = mostShared;
    }

    public void setMostViewed(String mostViewed) {
        this.mostViewed = mostViewed;
    }

    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();

    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
        @Override
        public String apply(Integer input) {
            switch (input) {
                case 1:
                    return mostEmailed;
                case 2:
                    return mostShared;
                case 3:
                    return mostViewed;
                default:
                    return "error";
            }
        }
    });

    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return mText;
    }
}