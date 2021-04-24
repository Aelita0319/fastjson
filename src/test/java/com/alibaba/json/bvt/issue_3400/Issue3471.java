package com.alibaba.json.bvt.issue_3400;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import junit.framework.TestCase;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.IOUtils;
import org.crazycake.shiro.exception.SerializationException;
import org.crazycake.shiro.serializer.RedisSerializer;


public class Issue3471 {

    @Test
    public void test_for_issue() {
        String str = "{\"@type\":\"org.apache.shiro.session.mgt.SimpleSession\",\"attributeKeys\":[\"org.apache.shiro" +
                ".subject.support.DefaultSubjectContext_AUTHENTICATED_SESSION_KEY\",\"org.apache.shiro.subject.support.DefaultSubjectContext_PRINCIPALS_SESSION_KEY\"],\"attributes\":{\"@type\":\"java.util.HashMap\",\"org.apache.shiro.subject.support.DefaultSubjectContext_AUTHENTICATED_SESSION_KEY\":true,\"org.apache.shiro.subject.support.DefaultSubjectContext_PRINCIPALS_SESSION_KEY\":{\"@type\":\"org.apache.shiro.subject.SimplePrincipalCollection\",\"empty\":false,\"primaryPrincipal\":{\"@type\":\"com.firestone.sys.vo.UserLoginVO\",\"buttonResources\":[null,\"/user-center/user/backend/save\",\"search\"],\"menuResources\":[],\"permissionResources\":[\"/shiro/needauth\"],\"productId\":1,\"resourceList\":[{\"children\":[],\"id\":1854,\"parentId\":1836,\"resourceKey\":\"/shiro/needauth\",\"resourceName\":\"搜索\",\"resourceType\":3},{\"children\":[{\"children\":[{\"children\":[],\"id\":1857,\"parentId\":1855,\"resourceName\":\"搜索\",\"resourceType\":2}],\"id\":1855,\"parentId\":1856,\"resourceName\":\"搜索\",\"resourceType\":2}],\"id\":1856,\"parentId\":1838,\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":1897,\"parentId\":1837,\"resourceKey\":\"/user-center/user/backend/save\",\"resourceName\":\"添加用户\",\"resourceType\":2},{\"children\":[],\"id\":2264,\"parentId\":2263,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2518,\"parentId\":2516,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2569,\"parentId\":2568,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2586,\"parentId\":2585,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2626,\"parentId\":2589,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2627,\"parentId\":2591,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2628,\"parentId\":2590,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2629,\"parentId\":2592,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2630,\"parentId\":2593,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2632,\"parentId\":2594,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2633,\"parentId\":2607,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2634,\"parentId\":2608,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2635,\"parentId\":2595,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2636,\"parentId\":2597,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2637,\"parentId\":2598,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2638,\"parentId\":2599,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2639,\"parentId\":2600,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2640,\"parentId\":2601,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2641,\"parentId\":2616,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2642,\"parentId\":2617,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2643,\"parentId\":2618,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2644,\"parentId\":2619,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2645,\"parentId\":2602,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2646,\"parentId\":2587,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2647,\"parentId\":2588,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2648,\"parentId\":2604,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2649,\"parentId\":2605,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2650,\"parentId\":2610,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2651,\"parentId\":2611,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2654,\"parentId\":2621,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2655,\"parentId\":2622,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2660,\"parentId\":2657,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2661,\"parentId\":2659,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2},{\"children\":[],\"id\":2664,\"parentId\":2663,\"resourceDesc\":\"\",\"resourceKey\":\"search\",\"resourceName\":\"搜索\",\"resourceType\":2}],\"roleVOs\":[{\"id\":693,\"productId\":1,\"roleDesc\":\"2321\",\"roleName\":\"管理员\"}],\"token\":\"85f74b78-f66b-45c8-ab87-803f2c9e7592\",\"user\":{\"id\":1,\"loginName\":\"cc\",\"loginPassword\":\"c2fc0865dc4706dde128d5aff9a44ef6ac\",\"mobile\":\"13311111111\"},\"userId\":1},\"realmNames\":[\"com.firestone.config.shiro.AccountAuthorizeRealm_0\"]}},\"expired\":false,\"host\":\"0:0:0:0:0:0:0:1\",\"id\":\"85f74b78-f66b-45c8-ab87-803f2c9e7592\",\"lastAccessTime\":1601257382117,\"startTimestamp\":1601256231530,\"timeout\":1800000,\"valid\":true}";

        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);

        JSONObject jsonObject = JSON.parseObject(str);
        ShiroValueRedisSerializer deserialize = JSON.parseObject(str,ShiroValueRedisSerializer.class);

    }

    public static class ShiroValueRedisSerializer implements RedisSerializer {
        private final ParserConfig defaultRedisConfig = new ParserConfig();

        {
            defaultRedisConfig.setAutoTypeSupport(true);
            JSON.DEFAULT_GENERATE_FEATURE = SerializerFeature.config(
                    JSON.DEFAULT_GENERATE_FEATURE, SerializerFeature.SkipTransientField, false);
        }

        public byte[] serialize(Object object) throws SerializationException {
            if (object == null) {
                return new byte[0];
            }
            try {
                return JSON.toJSONBytes(object, SerializerFeature.WriteClassName);
            } catch (Exception ex) {
                throw new org.springframework.data.redis.serializer.SerializationException("Could not serialize: " + ex.getMessage(), ex);
            }
        }

        public Object deserialize(byte[] bytes) throws SerializationException {
            if (bytes == null || bytes.length == 0) {
                return null;
            }
            try {
                return JSON.parseObject(new String(bytes, IOUtils.UTF8), Object.class, defaultRedisConfig);
            } catch (Exception ex) {
                throw new org.springframework.data.redis.serializer.SerializationException("Could not deserialize: " + ex.getMessage(), ex);
            }
        }
    }
}
