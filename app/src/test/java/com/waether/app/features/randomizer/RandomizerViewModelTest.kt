package com.waether.app.features.randomizer

import android.arch.core.executor.testing.InstantTaskExecutorRule
import com.waether.app.Feature.randomizer.RandomizerViewModel
import org.junit.Assert
import org.junit.Rule
import org.junit.Test


class RandomizerViewModelTest
{
    @JvmField
    @Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    @Test
    fun `init then Update numberLiveData value to Zero`()
    {
        //Arrange
        val viewModel= RandomizerViewModel()
        //Act
        val result = viewModel.numberLiveData.value
        //Assert

        Assert.assertTrue(result == 0)
        // initial value of numberliveData DEFUALT_VALUE
    }
    @Test
    fun `increment number when NumberLiveData is zero then update NumberLiveDataValue to one`()
    {
        //Arrange
        val viewModel= RandomizerViewModel()
        viewModel.numberLiveData.value=0

        //Act

        viewModel.incrementNumber()

        //Assert
        val result = viewModel.numberLiveData.value

        Assert.assertTrue(result==1)


     //When i invoke increment number it incrtemented by one

    }
}