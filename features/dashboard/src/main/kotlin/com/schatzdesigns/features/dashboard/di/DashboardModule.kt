/*
 * Copyright 2020 Zakayo Thuku.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.schatzdesigns.features.dashboard.di

import androidx.annotation.VisibleForTesting
import com.schatzdesigns.commons.ui.extensions.viewModel
import com.schatzdesigns.core.di.scopes.FeatureScope
import com.schatzdesigns.features.dashboard.DashboardFragment
import com.schatzdesigns.features.dashboard.DashboardViewModel
import dagger.Module
import dagger.Provides

/**
 * Class that contributes to the object graph [DashboardComponent].
 *
 * @see Module
 */
@Module
class DashboardModule(@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE) val fragment: DashboardFragment) {

    /**
     * Create a provider method binding for [DashboardViewModel].
     *
     * @return Instance of view model.
     * @see Provides
     */
    @Provides
    @FeatureScope
    fun providesDashboardViewModule() = fragment.viewModel {
        DashboardViewModel()
    }
}
