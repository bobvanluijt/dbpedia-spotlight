/**
 * Copyright 2011 Pablo Mendes, Max Jakob
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

package org.dbpedia.spotlight.model

class Surrogate(val surfaceForm: SurfaceForm, val resource: DBpediaResource)
{
    def equals(that : Surrogate) : Boolean =
    {
        surfaceForm.equals(that.surfaceForm) && resource.equals(that.resource)
    }

    override def toString = "Surrogate["+surfaceForm.name+","+resource.uri+"]"
}


object Surrogate
{
    def apply(surfaceForm : SurfaceForm, resource: DBpediaResource) = {
        new Surrogate(surfaceForm, resource)
    }
}