/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

fun amd_device_board_name() = "AMDDeviceBoardName".nativeClassCL("amd_device_board_name", AMD) {

	javaDoc("Native bindings to the $extensionName extension.")

	IntConstant.block(
		"""
		Accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo}. Returns the name of the GPU board and model of the specific device.

		Currently, this is only for GPU devices. The returned name is a 128-character value.
		""",

		"DEVICE_BOARD_NAME_AMD" _ 0x4038
	)

}