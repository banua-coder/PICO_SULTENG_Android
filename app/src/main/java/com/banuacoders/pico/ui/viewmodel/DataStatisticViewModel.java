package com.banuacoders.pico.ui.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.banuacoders.pico.data.model.DataStatisticsCovid;
import com.banuacoders.pico.data.repository.DataStatisticRepository;

import java.util.List;

public class DataStatisticViewModel extends AndroidViewModel {
    private DataStatisticRepository repository;
    private LiveData<List<DataStatisticsCovid>> allDataStatistics;

    public DataStatisticViewModel(@NonNull Application application) {
        super(application);
        repository = new DataStatisticRepository(application);
        allDataStatistics = repository.getAllDataStatistics();
    }

    public void insert(DataStatisticsCovid dataStatisticsCovid) {
        repository.insert(dataStatisticsCovid);
    }

    public void deleteAllData() {
        repository.deleteAllData();
    }

    public LiveData<List<DataStatisticsCovid>> getAllDataStatistics() {
        return allDataStatistics;
    }
}
