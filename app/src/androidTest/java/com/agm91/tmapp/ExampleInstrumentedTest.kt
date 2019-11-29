package com.agm91.tmapp

import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.agm91.tmapp.view.activity.MainActivity
import com.agm91.tmapp.viewmodel.AccountsViewModel
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun testAPI() {
        // GIVEN
        val scenario =
            ActivityScenario.launch(MainActivity::class.java)
        val viewModel = AccountsViewModel()

        // WHEN
        scenario.onActivity { activity ->
            viewModel.getAccounts().observe(activity, Observer { accounts ->
                // THEN
                scenario.onActivity { activity ->
                    val recycler = activity.findViewById<RecyclerView>(R.id.recycler)
                    Assert.assertTrue(recycler.adapter?.itemCount != 0)
                }
            })
        }
    }

    @Test
    fun testRecycler() {
        // GIVEN
        val scenario =
            ActivityScenario.launch(MainActivity::class.java)
        val viewModel = AccountsViewModel()

        // WHEN
        scenario.onActivity { activity ->
            viewModel.getAccounts().observe(activity, Observer {
                // THEN
                scenario.onActivity { activity ->
                    val recycler = activity.findViewById<RecyclerView>(R.id.recycler)
                    Assert.assertTrue(recycler.adapter?.itemCount != 0)
                    recycler.adapter?.itemCount?.let { itemCount ->
                        Assert.assertTrue(itemCount == 3)
                        onView(withId(R.id.myswitch)).perform(click())
                        Assert.assertTrue(itemCount == 2)
                    }

                }
            })
        }
    }
}
