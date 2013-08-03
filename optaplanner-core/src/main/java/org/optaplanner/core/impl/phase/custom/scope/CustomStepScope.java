/*
 * Copyright 2011 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.core.impl.phase.custom.scope;

import org.optaplanner.core.impl.phase.step.AbstractStepScope;

public class CustomStepScope extends AbstractStepScope {

    private final CustomSolverPhaseScope phaseScope;

    private int uninitializedVariableCount = -1;

    public CustomStepScope(CustomSolverPhaseScope phaseScope) {
        this(phaseScope, phaseScope.getLastCompletedStepScope().getStepIndex() + 1);
    }

    public CustomStepScope(CustomSolverPhaseScope phaseScope, int stepIndex) {
        super(stepIndex);
        this.phaseScope = phaseScope;
    }

    @Override
    public CustomSolverPhaseScope getPhaseScope() {
        return phaseScope;
    }

    @Override
    public boolean isBestSolutionCloningDelayed() {
        return false;
    }

    public int getUninitializedVariableCount() {
        return uninitializedVariableCount;
    }

    public void setUninitializedVariableCount(int uninitializedVariableCount) {
        this.uninitializedVariableCount = uninitializedVariableCount;
    }

    // ************************************************************************
    // Calculated methods
    // ************************************************************************

}