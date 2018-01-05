package org.softeam.github.bowlingscore


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater

import android.view.ViewGroup

import android.view.View


/**
 * A simple [Fragment] subclass.
 */
class OneFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_one, container, false)
    }

}// Required empty public constructor
