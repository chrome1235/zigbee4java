/*
   Copyright 2012-2013 CNR-ISTI, http://isti.cnr.it
   Institute of Information Science and Technologies
   of the Italian National Research Council


   See the NOTICE file distributed with this work for additional
   information regarding copyright ownership

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package org.bubblecloud.zigbee.api.cluster.impl.api.measureament_sensing;

import org.bubblecloud.zigbee.api.cluster.impl.api.core.Attribute;
import org.bubblecloud.zigbee.api.cluster.impl.api.core.ZCLCluster;

/**
 * @author <a href="mailto:manlio.baco@isti.cnr.it">Manlio Bacco</a>
 * @version $LastChangedRevision: 42 $ ($LastChangedDate: 2010-09-23 14:21:48 +0200 (Thu, 23 Sep 2010) $)
 * @since 0.8.0
 */
public interface IlluminanceMeasurement extends ZCLCluster {

    static final short ID = 0x0400;
    static final String NAME = "Illuminance Measurement";
    static final String DESCRIPTION = "Attributes and commands for configuring the measurement of illuminance and reporting illuminance measurement.";

    public Attribute getMeasuredValue();

    public Attribute getMinMeasuredValue();

    public Attribute getMaxMeasuredValue();

    public Attribute getTolerance();

    public Attribute getLightSensorType();
}