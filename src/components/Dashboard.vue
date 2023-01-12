<script setup lang="ts">
import DoughnutChart from './DoughnutChart.vue';
</script>

<template>
    <div class="grid grid-cols-3 grid-rows-2 h-screen space-x-40">
        <div class="col-span-1 row-span-2 h-5/6 bg-slate-600 rounded-md mt-5">
            <!-- insert graph content here-->
            <DoughnutChart />
        </div>

        <div class="col-span-2 row-span-1 h-3/4 bg-pink-300 rounded-md">
            <!-- insert graph content here -->
        </div>

        <div class="col-span-2 row-span-1 h-3/4 bg-cyan-600 rounded-md">
            <!-- insert graph content here -->
        </div>
    </div>

</template>

<!-- <style scoped>
.wrapper {
    display: grid;
}
.leftBar {
    background-color: aqua;
    height: 2rem;
    width: 2rem;
}
</style> -->