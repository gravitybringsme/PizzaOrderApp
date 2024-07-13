package com.neppplus.pizzaorderapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.neppplus.pizzaorderapp.R
import com.neppplus.pizzaorderapp.adapters.PizzaStoreAdapter
import com.neppplus.pizzaorderapp.datas.Store

class PizzaStoreListFragment : Fragment(){

    val mPizzaStoreDataList = ArrayList<Store>()

    lateinit var mPizzaStoreAdapter : PizzaStoreAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizza_store_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // 동작관련 코드

        mPizzaStoreDataList.add(Store("A피자가게", "1111-5555", "https://cdn3.iconfinder.com/data/icons/street-food-and-food-trucker-1/64/pizza-fast-food-bake-bread-128.png"))
        mPizzaStoreDataList.add(Store("B피자가게", "1111-5556", "https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png"))
        mPizzaStoreDataList.add(Store("C피자가게", "1111-5557", "https://cdn3.iconfinder.com/data/icons/food-set-3/91/Food_C219-128.png"))
        mPizzaStoreDataList.add(Store("D피자가게", "1111-5558", "https://cdn0.iconfinder.com/data/icons/fastfood-31/64/pizza-italian-food-fast-fastfood-cheese-piece-128.png"))

        mPizzaStoreAdapter = PizzaStoreAdapter(requireContext(), R.layout.pizza_store_list_item, mPizzaStoreDataList)

        view?.let {
            val pizzaStoreListView = it.findViewById<ListView>(R.id.pizzaStoreListView)
            pizzaStoreListView.adapter = mPizzaStoreAdapter
        }
    }
}