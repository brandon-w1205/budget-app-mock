<script setup lang="ts">
import BarChart from './charts/BarChart.vue';
import DoughnutChart from './charts/DoughnutChart.vue';
import LineChart from './charts/LineChart.vue';
</script>

<template>
    <div class="grid grid-cols-3 grid-rows-3 min-h-screen">
        <div class="col-span-3 row-span-1 bg-slate-600 rounded-md ">
            <!-- insert graph content here-->
            <div class="flex items-end justify-around">
                <div class="">
                    <DoughnutChart />
                </div>
                <div>
                    <BarChart />
                </div>
                <div>
                    <LineChart />
                </div>

            </div>
            
        </div>

        <div class="col-span-3 row-span-2 h-5/6 bg-cyan-700 rounded-md mt-3">
            <div>
                <!-- insert relational graph content here -->
            </div>
        </div>
    </div>

</template>