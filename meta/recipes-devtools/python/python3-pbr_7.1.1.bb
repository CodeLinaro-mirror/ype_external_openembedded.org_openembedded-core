SUMMARY = "Python Build Reasonableness"
DESCRIPTION = "PBR is a library that injects some useful and sensible default behaviors into your setuptools run"
HOMEPAGE = "https://pypi.org/project/pbr"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

DEPENDS = "python3-setuptools-native"

inherit pypi python_pbr

RDEPENDS:${PN} += "python3-setuptools"

BBCLASSEXTEND = "native nativesdk"

SRC_URI[sha256sum] = "973da2aee9961d7cb278aa74e1829f6daafec9dd8ee8c1655cbf3f5843bfe083"
