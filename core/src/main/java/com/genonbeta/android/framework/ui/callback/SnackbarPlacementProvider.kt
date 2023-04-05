
package com.genonbeta.android.framework.ui.callback

import com.google.android.material.snackbar.Snackbar


fun interface SnackbarPlacementProvider {
    fun createSnackbar(resId: Int, vararg objects: Any?): Snackbar?
}