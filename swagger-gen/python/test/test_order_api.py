# coding: utf-8

"""
    Bybit API

    ## REST API for the Bybit Exchange.   # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: support@bybit.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import swagger_client
from swagger_client.api.order_api import OrderApi  # noqa: E501
from swagger_client.rest import ApiException


class TestOrderApi(unittest.TestCase):
    """OrderApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.order_api.OrderApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_order_cancel(self):
        """Test case for order_cancel

        Get my active order list.  # noqa: E501
        """
        pass

    def test_order_get_orders(self):
        """Test case for order_get_orders

        Get my active order list.  # noqa: E501
        """
        pass

    def test_order_new(self):
        """Test case for order_new

        Place active order  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
