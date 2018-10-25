package edu.uw.viewpager


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class SearchFragment : Fragment() {
    private var callback: OnSearchListener? = null

    internal interface OnSearchListener {
        fun onSearchSubmitted( searchTerm: String)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        try {
            callback = context as SearchFragment.OnSearchListener?
        } catch (e: ClassCastException) {
            throw ClassCastException(context!!.toString() + " must implement OnSearchListener")
        }

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.fragment_search, container, false)
        
        return rootView
    }

    companion object {
        fun newInstance() {

        }
    }


}
